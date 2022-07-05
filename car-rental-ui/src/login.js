import React, { Component } from 'react';
import { Card } from 'primereact/card';
import { Button } from 'primereact/button'
class LoginScreen extends Component {
    constructor(props) {
        super(props)
        this.state = {

        }
        this.routeToPage.bind(this)
    }
    routeToPage = (page) => {
        //page === "Admin" ? this.props.history.push("/Admin") : this.props.history.push("/userSearch")
        console.log("sampe" + this)
    }
    render() {
        const footer = <span>
            <Button label="Admin" onClick={this.routeToPage("Admin")} icon="pi pi-check" style={{ marginRight: '.25em' }} />
            <Button label="User" onClick={this.routeToPage("User")} icon="pi pi-times" className="p-button-secondary" />
        </span>;
        return (
            <div>
                <Card footer={footer}>
                    Dummy login
                </Card>
            </div>
        );
    }
}

export default LoginScreen;