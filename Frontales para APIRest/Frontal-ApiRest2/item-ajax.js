$(document).ready(function () {
 getPageData();

//  Get Page Data
  function getPageData() {
    $.ajax({
      dataType: "json",
      url: "http://localhost:8888/api/grados",
    }).done(function (data) {
      console.log(data.data);
      manageRow(data.data);
    });
  }

  /* Add new Item table row */
  function manageRow(data) {
    var rows = "";
    $.each(data, function (key, value) {
      rows = rows + "<tr>";
      rows = rows + "<td>" + value.grado_type + "</td>";
      rows = rows + "<td>" + value.limite_alumnos + "</td>";
      rows = rows + "<td>" + value.nombre_grado + "</td>";

      rows = rows + '<td data-id="' + value.id + '">';
      rows = rows + 
      '<button data-toggle="modal" data-target="#edit-item" class="btn btn-primary edit-item">Edit'+
      //'<button data-toggle="modal" data-target="#edit-item" class="btn btn-link edit-item">'+  
      //'<span class="glyphicon glyphicon-pencil"></span>'+
      '</button>';
      rows = rows + 
      '<button class="btn btn-danger remove-item">Delete'+
      //'<button class="btn btn-link remove-item">'+
      //'<span class="glyphicon glyphicon-trash"></span>'+
      '</button>';
      rows = rows + "</td>";
      rows = rows + "</tr>";
    });
    $("tbody").html(rows);
  }

  /* Create new Item */
  $(".crud-submit").click(function (e) {
    var gradotype = $("#create-item").find("input[name='gradotype']").val();
    var limitealumnos = $("#create-item").find("input[name='limitealumnos']").val();
    var nombregrado = $("#create-item").find("input[name='nombregrado']").val();
    console.log(gradotype+limitealumnos+nombregrado);
    if (gradotype != "" && nombregrado != "" ) {
          $.ajax({
            dataType: "json",
            type: "POST",
            url: "create.php",
            data: { gradotype: gradotype, 
                    limitealumnos: limitealumnos, 
                    nombregrado: nombregrado
                   },
          }).done(function (data) {
            $("#create-item").find("input[name='gradotype']").val("");
            $("#create-item").find("input[name='limitealumnos']").val("");
            $("#create-item").find("input[name='nombregrado']").val("");
            getPageData();
            $(".modal").modal("hide");
            toastr.success("Item Created Successfully.", "Success Alert", {
              timeOut: 5000,
            });
          });
    } else {
      alert("You are missing data.");
    }
  });

  /* Remove Item */
  $("body").on("click", ".remove-item", function () {
    var id = $(this).parent("td").data("id");
    var c_obj = $(this).parents("tr");
    $.ajax({
      dataType: "json",
      type: "POST",
      url: "delete.php",
      data: { id: id },
    }).done(function (data) {
      c_obj.remove();
      toastr.success("Item borrado correctamente", "Success Alert", {
        timeOut: 5000,
      });
      getPageData();
    });
  });

  /* Edit Item */
  $("body").on("click", ".edit-item", function () {
    var id = $(this).parent("td").data("id");
    
    var gradotype = $(this).parent("td").prev("td").prev("td").prev("td").text();
    var limitealumnos = $(this).parent("td").prev("td").prev("td").text();
    var nombregrado = $(this).parent("td").prev("td").text();
    
    $("#edit-item").find("input[name='gradotype']").val(gradotype);
    $("#edit-item").find("input[name='limitealumnos']").val(limitealumnos);
    $("#edit-item").find("input[name='nombregrado']").val(nombregrado);

    $("#edit-item").find(".edit-id").val(id);
  });

  /* Updated new Item */
  $(".crud-submit-edit").click(function (e) {
    var id = $("#edit-item").find(".edit-id").val();

    var gradotype = $("#edit-item").find("input[name='gradotype']").val();
    var limitealumnos = $("#edit-item").find("input[name='limitealumnos']").val();
    var nombregrado = $("#edit-item").find("input[name='nombregrado']").val();

    if (gradotype != "" && nombregrado != "") {
      $.ajax({
        dataType: "json",
        type: "POST",
        url: "update.php",
        data: { id: id,  
               gradotype: gradotype, 
               limitealumnos: limitealumnos, 
               nombregrado: nombregrado },
      }).done(function (data) {
        getPageData();
        $(".modal").modal("hide");
        toastr.success("Item actualizado correctamente.", "Success Alert", {
          timeOut: 5000,
        });
      });
    } else {
      alert("You are missing title or description.");
    }
  });
});