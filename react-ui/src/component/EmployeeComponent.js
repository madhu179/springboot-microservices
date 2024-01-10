import React, { Component } from 'react';
import EmployeeService from '../service/EmployeeService';

class EmployeeComponent extends Component {

    constructor(props) {
        super(props);

        this.state = {
            employee: {},
            department: {},
            organization: {}
        }
        
    }

    //This method is called when this component is mounted
    componentDidMount(){
        EmployeeService.getEmployee().then((response) => {
            console.log(response.data);
            this.setState({employee : response.data.employee})
            this.setState({department : response.data.department})
            this.setState({organization : response.data.organization})

            console.log(this.state.employee)
            console.log(this.state.department)
            console.log(this.state.organization)
        })
    }
    
    render() {
        return (
            <div>
                
            </div>
        );
    }
}

export default EmployeeComponent;