import React, { Component } from 'react';
import serialize from 'form-serialize';

class PropertyLocation extends Component {

    constructor(props) {
        super(props);

    }

    saveAction = (e) => {

        e.preventDefault();
        var form = serialize(e.target, { hash: true });

        if (this.validation(form)) {
            this.props.onSave(form);
        }

    }



    validation(data) {
        return true
    }

    render() {
        var showThisBlock = {
            display: this.props.visible ? 'block' : 'none'
        }

        return (
            <form onSubmit={this.saveAction}>
                <div className="full-width no-bg" id="nav-frames" style={showThisBlock}>
                    <div className="row no-bg justify-content-center">
                        <div className="location-checklist" style={{ margin: '20px 15px 10px 10px', width: '100%' }}>
                            <h3 style={{ fontSize: '17px', fontWeight: '700' }}>Verify the location</h3>
                        </div>
                        <div className="full-width" style={{ margin: '10px 15px 10px 10px', height: '1px', background: '#D3D8DE' }}></div>
                    </div>

                    <div className="row no-bg justify-content-center">

                        <div className="form-element">
                            <div className="form-label">
                                <label className="form-label">Street Address</label>
                            </div>
                            <div className="street-address child-margin">
                                <input type="text" name="streetAddress" placeholder="Street Address" />
                            </div>
                        </div>



                        <div className="form-element">
                            <div className="form-label">
                                <label className="form-label">City</label>
                            </div>
                            <div className="street-address child-margin">
                                <input type="text" name="cityName" placeholder="City" style={{ background: 'transparent' }} />
                            </div>
                        </div>

                        <div className="form-element">
                            <div className="form-label">
                                <label className="form-label">State</label>
                            </div>
                            <div className="selector child-margin">
                                <select className="full-width no-bg" name="state" >
                                    <option value="CALIFORNIA" selected>CALIFORNIA</option>
                                    <option value="WASHINGTON">WASHINGTON</option>
                                    <option value="TEXAS">TEXAS</option>
                                    <option value="CHICAGO">CHICAGO</option>
                                </select>
                            </div>
                        </div>

                        <div className="form-element">
                            <div className="form-label">
                                <label className="form-label">Zip Code</label>
                            </div>
                            <div className="street-address child-margin">
                                <input type="number" name="zipcode" placeholder="Zip Code" style={{ background: 'transparent' }} />
                            </div>
                        </div>

                    </div>

                    <div className="row justify-content-center mt-2">
                        <div className="col-md-2">
                            <button className="btn btn-default btn-block btn-rounded btn-cancel">Cancel </button>
                        </div>
                        <div className="col-md-2"></div>

                        <div className="col-md-2">
                            <button type="submit" className="btn btn-primary btn-block btn-rounded btn-save" >Save</button>
                        </div>
                    </div>

                </div>
            </form>

        );
    }
}

export default PropertyLocation;