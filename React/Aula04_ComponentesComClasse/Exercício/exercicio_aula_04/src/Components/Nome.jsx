import {Component} from 'react'

class Nome extends Component {
    constructor (props) {
        super(props);
        this.state = {
            nome: 'Rosalía',
        };
    }

    render () {
        return (
            <div>
                <h2>Nome - {this.state.nome}:</h2>
            </div>
        );
    }
}

export default Nome;