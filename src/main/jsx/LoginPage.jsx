import '../webapp/css/custom.css';

import React from 'react';
import ReactDOM from 'react-dom';

class LoginPage extends React.Component {

    render(){
        return (
            <div className="login">
                <form className="loginForm">
                    <input type="text"></input>
                    <hr />
                    <button>로그인</button>
                    <button>회원가입</button>
                </form>
            </div>
        )
    }
}

ReactDOM.render(<LoginPage />,document.getElementById('root'));