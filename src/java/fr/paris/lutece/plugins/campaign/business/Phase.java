/*
 * Copyright (c) 2002-2021, City of Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.campaign.business;

import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

/**
 * This is the business class for the object Phase
 */
public class Phase implements Serializable
{
    private static final long serialVersionUID = 1L;

    // Variables declarations
    private int _nId;

    private int _nIdCampaign;
    @NotNull( message = "#i18n{portal.validation.message.notEmpty}" )
    private LocalDateTime _dateStartingDate;
    @NotNull( message = "#i18n{portal.validation.message.notEmpty}" )
    private LocalDateTime _dateEndingDate;

    @NotEmpty( message = "#i18n{campaign.validation.phase.Label.notEmpty}" )
    @Size( max = 255, message = "#i18n{campaign.validation.phase.Label.size}" )
    private String _strLabel;

    private int _nOrderNum;

    /**
     * Returns the Id
     * 
     * @return The Id
     */
    public int getId( )
    {
        return _nId;
    }

    /**
     * Sets the Id
     * 
     * @param nId
     *            The Id
     */
    public void setId( int nId )
    {
        _nId = nId;
    }

    /**
     * Returns the IdCampaign
     * 
     * @return The IdCampaign
     */
    public int getIdCampaign( )
    {
        return _nIdCampaign;
    }

    /**
     * Sets the IdCampaign
     * 
     * @param nIdCampaign
     *            The IdCampaign
     */
    public void setIdCampaign( int nIdCampaign )
    {
        _nIdCampaign = nIdCampaign;
    }

    /**
     * Returns the StartingDate
     * 
     * @return The StartingDate
     */
    public LocalDateTime getStartingDate( )
    {
        return _dateStartingDate;
    }

    /**
     * Sets the StartingDate
     * 
     * @param dateStartingDate
     *            The StartingDate
     */
    public void setStartingDate( LocalDateTime dateStartingDate )
    {
        _dateStartingDate = dateStartingDate;
    }

    /**
     * Returns the StartingDate
     * 
     * @return The StartingDate
     */
    public Timestamp getStartingTimeStampDate( )
    {
        if ( _dateStartingDate != null )
        {
            return Timestamp.valueOf( _dateStartingDate );
        }
        return null;
    }

    /**
     * Sets the StartingDate
     * 
     * @param dateStartingDate
     *            The StartingDate
     */
    public void setStartingTimeStampDate( Timestamp dateStartingDate )
    {
        if ( dateStartingDate != null )
        {

            _dateStartingDate = dateStartingDate.toLocalDateTime( );
        }
    }

    /**
     * Returns the EndingDate
     * 
     * @return The EndingDate
     */
    public LocalDateTime getEndingDate( )
    {
        return _dateEndingDate;
    }

    /**
     * Sets the EndingDate
     * 
     * @param dateEndingDate
     *            The EndingDate
     */
    public void setEndingDate( LocalDateTime dateEndingDate )
    {
        _dateEndingDate = dateEndingDate;
    }

    /**
     * Sets the EndingDate
     * 
     * @param dateEndingDate
     *            The EndingDate
     */
    public void setEndingTimeStampDate( Timestamp dateEndingDate )
    {
        if ( dateEndingDate != null )
        {
            _dateEndingDate = dateEndingDate.toLocalDateTime( );
        }
    }

    /**
     * Returns the EndingDate
     * 
     * @return The EndingDate
     */
    public Timestamp getEndingTimeStampDate( )
    {
        if ( _dateEndingDate != null )
        {

            return Timestamp.valueOf( _dateEndingDate );
        }
        return null;
    }

    /**
     * Returns the Label
     * 
     * @return The Label
     */
    public String getLabel( )
    {
        return _strLabel;
    }

    /**
     * Sets the Label
     * 
     * @param strLabel
     *            The Label
     */
    public void setLabel( String strLabel )
    {
        _strLabel = strLabel;
    }

    /**
     * Returns the OrderNum
     * 
     * @return The OrderNum
     */
    public int getOrderNum( )
    {
        return _nOrderNum;
    }

    /**
     * Sets the OrderNum
     * 
     * @param nOrderNum
     *            The OrderNum
     */
    public void setOrderNum( int nOrderNum )
    {
        _nOrderNum = nOrderNum;
    }
}
