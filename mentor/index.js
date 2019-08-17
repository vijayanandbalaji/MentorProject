	function showcommentform(btnId) {  
	document.getElementById('id1').value = document.getElementById(btnId).getAttribute('data');  
    var v=document.getElementById('id1').value;
	
	
	
	
	/* 
		
		" <label for="username"> < span class= "req" >* </span> User name:   </label> <input class="form-control" type="text" name="username" id = "txt"  placeholder="" required />   "; 

	 var data=
		"Name:<br><input type='text' name='name'><br>Comment:<br><textarea rows='5' cols='50'></textarea><br><input type='submit' value='submit'>";  
		document.getElementById('mylocation').innerHTML=data;   
	 */
	 
	 if(v==1)
	 {

		 
		/*  
		  var codeBlock= '<div class="modal-dialog text-center">'+
						'<div class="col-sm-8 main-section">'+
						'<div class="modal-content">'+
						'<form class="col-12">'+
						'<div class="form-group">'+
						'<input type="text" class="form-control" placeholder="Enter Username">'+
						'</div>'+
						'<div class="form-group">'+
						'<input type="email" class="form-control" placeholder="Enter Mail">'+
						'</div>'+
						'<div class="form-group">'+
						'<input type="password" class="form-control" placeholder="Enter Password">'+
						'</div>'+
						'<div class="form-group">'+
						'<input type="password" class="form-control" placeholder="Re-enter Password">'+
						'</div>'+
						'<button type="submit" class="btn"><i class="fas fa-sign-in-alt"></i>Login</button>'+
						'</form>'+
						'</div>'+
						'</div>'+
						'</div>'; */
						
		 var codeBlock='<div class="container">'+
		'<div class="row main">'+
			'<div class="panel-heading">'+
				'<div class="panel-title text-center">'+
					'<h1 class="title">User SignUp</h1>'+
					'<hr />'+
				'</div>'+
			'</div> '+
			'<div class="main-login main-center">'+
				'<form class="form-horizontal" method="post" action="#">'+
					'<div class="form-group">'+
						'<label for="name" class="cols-sm-2 control-label">Your Name</label>'+
						'<div class="cols-sm-10">'+
							'<div class="input-group">'+
								'<span class="input-group-addon"><i class="fa fa-user fa-lg" aria-hidden="true"></i></span>'+
								'<input type="text" class="form-control" name="name" id="name"  placeholder="Enter your Name" />'+
							'</div>'+
							'<div class="message" id="message_name">'+
							'</div>'+
						'</div>'+
					'</div>'+
					'<div class="form-group">'+
						'<label for="email" class="cols-sm-2 control-label">Your Email</label>'+
						'<div class="cols-sm-10">'+
							'<div class="input-group">'+
								'<span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>'+
								'<input type="email" class="form-control" name="email" id="email"  placeholder="Enter your Email"/>'+
							'</div>'+
							'<div class="message" id="message_mail">'+
							'</div>'+
						'</div>'+
					'</div>'+
				
					
				
					'<div class="form-group">'+
						'<label for="password" class="cols-sm-2 control-label">Password</label>'+
						'<div class="cols-sm-10">'+
							'<div class="input-group">'+
								'<span class="input-group-addon"><i class="fa fa-unlock fa-lg" aria-hidden="true"></i></span>'+
								'<input type="password" class="form-control" name="password" id="password"  placeholder="Enter your Password"/>'+
							'</div>'+
							'<div class="message" id="message_password">'+
							'</div>'+
						'</div>'+
				'</div>'+
					'<div class="form-group">'+
						'<label for="confirm" class="cols-sm-2 control-label">Confirm Password</label>'+
						'<div class="cols-sm-10">'+
							'<div class="input-group">'+
								'<span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>'+
							'	<input type="password" class="form-control" name="conf_password" id="conf_password"  placeholder="Confirm your Password"/>'+
							'</div>'+
						'	<div class="message" id="message_conf_password">'+
						'	</div>'+
						'</div>'+
					'</div>'+
					'<div class="form-group ">'+
						'<button type="button" class="btn btn-primary btn-lg btn-block login-button" onclick="check()">Register</button>'+
					'</div>'+
				'</form>'+
			'</div>'+
			'<div class="panel-heading">'+
				'<div class="panel-title text-center">'+
					'<hr />'+
				'</div>'+
			'</div> '+
		'</div>'+
	'</div>';
		 
		 
	
 
		document.getElementById('myform').innerHTML=codeBlock;   
	 }
	  else if(v==2)
	 {
		 var codeBlock='<div class="container">'+
		'<div class="row main">'+
			'<div class="panel-heading">'+
				'<div class="panel-title text-center">'+
					'<h1 class="title">Mentor SignUp</h1>'+
					'<hr />'+
				'</div>'+
			'</div> '+
			'<div class="main-login main-center">'+
				'<form class="form-horizontal" method="post" action="#">'+
					'<div class="form-group">'+
						'<label for="name" class="cols-sm-2 control-label">Your Name</label>'+
						'<div class="cols-sm-10">'+
							'<div class="input-group">'+
								'<span class="input-group-addon"><i class="fa fa-user fa-lg" aria-hidden="true"></i></span>'+
								'<input type="text" class="form-control" name="name" id="name"  placeholder="Enter your Name" />'+
							'</div>'+
							'<div class="message" id="message_name">'+
							'</div>'+
						'</div>'+
					'</div>'+
					'<div class="form-group">'+
						'<label for="email" class="cols-sm-2 control-label">Your Email</label>'+
						'<div class="cols-sm-10">'+
							'<div class="input-group">'+
								'<span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>'+
								'<input type="email" class="form-control" name="email" id="email"  placeholder="Enter your Email"/>'+
							'</div>'+
							'<div class="message" id="message_mail">'+
							'</div>'+
						'</div>'+
					'</div>'+
				
					
				
					'<div class="form-group">'+
						'<label for="password" class="cols-sm-2 control-label">Password</label>'+
						'<div class="cols-sm-10">'+
							'<div class="input-group">'+
								'<span class="input-group-addon"><i class="fa fa-unlock fa-lg" aria-hidden="true"></i></span>'+
								'<input type="password" class="form-control" name="password" id="password"  placeholder="Enter your Password"/>'+
							'</div>'+
							'<div class="message" id="message_password">'+
							'</div>'+
						'</div>'+
				'</div>'+
					'<div class="form-group">'+
						'<label for="confirm" class="cols-sm-2 control-label">Confirm Password</label>'+
						'<div class="cols-sm-10">'+
							'<div class="input-group">'+
								'<span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>'+
							'	<input type="password" class="form-control" name="conf_password" id="conf_password"  placeholder="Confirm your Password"/>'+
							'</div>'+
						'	<div class="message" id="message_conf_password">'+
						'	</div>'+
						'</div>'+
					'</div>'+
					'<div class="form-group ">'+
						'<button type="button" class="btn btn-primary btn-lg btn-block login-button" onclick="check()">Register</button>'+
					'</div>'+
				'</form>'+
			'</div>'+
			'<div class="panel-heading">'+
				'<div class="panel-title text-center">'+
					'<hr />'+
				'</div>'+
			'</div> '+
		'</div>'+
	'</div>';
		 
    
 
		document.getElementById('myform').innerHTML=codeBlock; 
	 }
	  else if(v==3)
	 {
		 var codeBlock='<div class="container">'+
		'<div class="row main">'+
			'<div class="panel-heading">'+
				'<div class="panel-title text-center">'+
					'<h1 class="title">Admin SignUp</h1>'+
					'<hr />'+
				'</div>'+
			'</div> '+
			'<div class="main-login main-center">'+
				'<form class="form-horizontal" method="post" action="#">'+
					'<div class="form-group">'+
						'<label for="name" class="cols-sm-2 control-label">Your Name</label>'+
						'<div class="cols-sm-10">'+
							'<div class="input-group">'+
								'<span class="input-group-addon"><i class="fa fa-user fa-lg" aria-hidden="true"></i></span>'+
								'<input type="text" class="form-control" name="name" id="name"  placeholder="Enter your Name" />'+
							'</div>'+
							'<div class="message" id="message_name">'+
							'</div>'+
						'</div>'+
					'</div>'+
					'<div class="form-group">'+
						'<label for="email" class="cols-sm-2 control-label">Your Email</label>'+
						'<div class="cols-sm-10">'+
							'<div class="input-group">'+
								'<span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>'+
								'<input type="email" class="form-control" name="email" id="email"  placeholder="Enter your Email"/>'+
							'</div>'+
							'<div class="message" id="message_mail">'+
							'</div>'+
						'</div>'+
					'</div>'+
				
					
				
					'<div class="form-group">'+
						'<label for="password" class="cols-sm-2 control-label">Password</label>'+
						'<div class="cols-sm-10">'+
							'<div class="input-group">'+
								'<span class="input-group-addon"><i class="fa fa-unlock fa-lg" aria-hidden="true"></i></span>'+
								'<input type="password" class="form-control" name="password" id="password"  placeholder="Enter your Password"/>'+
							'</div>'+
							'<div class="message" id="message_password">'+
							'</div>'+
						'</div>'+
				'</div>'+
					'<div class="form-group">'+
						'<label for="confirm" class="cols-sm-2 control-label">Confirm Password</label>'+
						'<div class="cols-sm-10">'+
							'<div class="input-group">'+
								'<span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>'+
							'	<input type="password" class="form-control" name="conf_password" id="conf_password"  placeholder="Confirm your Password"/>'+
							'</div>'+
						'	<div class="message" id="message_conf_password">'+
						'	</div>'+
						'</div>'+
					'</div>'+
					'<div class="form-group ">'+
						'<button type="button" class="btn btn-primary btn-lg btn-block login-button" onclick="check()">Register</button>'+
					'</div>'+
				'</form>'+
			'</div>'+
			'<div class="panel-heading">'+
				'<div class="panel-title text-center">'+
					'<hr />'+
				'</div>'+
			'</div> '+
		'</div>'+
	'</div>';
		 
 
		document.getElementById('myform').innerHTML=codeBlock; 
	 }
	 
	 else if(v==4)
	 {
		document.getElementById('mylocation').innerHTML='User Login Page';
		 var codeBlock = '<div class="content">' +
                        '<h1>This is a heading</h1>' +
                        '<p>This is a paragraph of text.</p>' +
                        '<p><strong>Note:</strong> If you don\'t escape "quotes" properly, it will not work.</p>' +
                    '</div>';
    
 
		document.getElementById('myform').innerHTML=codeBlock; 
	 }
	else if(v==5)
	 {
		document.getElementById('mylocation').innerHTML='Mentor Login Page';
		 var codeBlock = '<div class="content">' +
                        '<h1>This is a heading</h1>' +
                        '<p>This is a paragraph of text.</p>' +
                        '<p><strong>Note:</strong> If you don\'t escape "quotes" properly, it will not work.</p>' +
                    '</div>';
    
 
		document.getElementById('myform').innerHTML=codeBlock; 
	 }
	else if(v==6)
	 {
		document.getElementById('mylocation').innerHTML='Admin Login Page';
		 var codeBlock = '<div class="content">' +
                        '<h1>This is a heading</h1>' +
                        '<p>This is a paragraph of text.</p>' +
                        '<p><strong>Note:</strong> If you don\'t escape "quotes" properly, it will not work.</p>' +
                    '</div>';
    
 
		document.getElementById('myform').innerHTML=codeBlock; 
	 }
	 
}
  
	