import {Component} from 'react'

export class Nota extends Component{
    render () {
        return (
            <div>
                <h1>Notas</h1>
                <table>
                    <thead>
                        <tr>
                            <th>Nota</th>
                        </tr>
                    </thead>
                
                <tbody>
                    <tr>
                        <td>10</td>
                    </tr>
                    <tr>
                        <td>7</td>
                    </tr>
                    <tr>
                        <td>10</td>
                    </tr>
                    <tr>
                        <td>9</td>
                    </tr>

                    <tr>
                        <th>Média</th>
                        <td>{(10 + 7 + 10 + 9) / 4}</td>
                    </tr>
                </tbody>
                </table>
            </div>
        )
    } 
}

export default Nota