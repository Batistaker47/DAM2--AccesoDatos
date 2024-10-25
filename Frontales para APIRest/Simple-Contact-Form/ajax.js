$(document).ready(function()
{	
	$(document).on('submit', '#reg-form', function()
	{
		//var data = $(this).serialize();
        var name = $("#reg-form").find("input[name='Name']").val();
        var city = $("#reg-form").find("input[name='City']").val();
        var email = $("#reg-form").find("input[name='Email']").val();
        var message = $("#reg-form").find("textarea[name='Message']").val();

        console.log(name + city + email + message)

		$.ajax({	
			type : 'POST',
			url  : 'http://localhost:8080/api/users',
			data : JSON.stringify ({ 
                name: name, 
                city: city, 
                email: email,
                message: message
               }),
            contentType: "application/json",
			success :  function(data)
		   {						
            console.log("success")				
			}
		});
		return false;
	});
});