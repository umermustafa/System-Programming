function to_lower() 
{
    local str="$@"
    local output     
    output=$(tr '[A-Z]' '[a-z]'<<<"${str}")
    echo $output
}

function is_root() 
{
   [ $(id -u) -eq 0 ] && return $true || return $FALSE
}


function is_user_exits() 
{
   getent passwd $1 > /dev/null

	if [ $? -eq 0 ]; then
	    echo "yes the user exists"
	else
    	    echo "No, the user does not exist"
	fi
}


