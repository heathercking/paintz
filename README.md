# Paintz!

This is Paintz! The model paint app. 


## MVP 

Create a relational database holding information on model paints, for key UK brands (start with the top 3). It should consist of:

1. Intelligent search functionality:
    - be able to search by:
        - Paint brand 
        - Paint number - full or partial (if partial, bring up suggestions for ‘did you mean…’)
        - Paint name - full or partial
    - bringing up results for:
        - Exact matches - and the exact equivalents across all brands
        - Closest/alternative matches
        - Mixes - possible mixes of colours to make a match?	
2. User accounts
3. User inventory - user can save paints/stock level to their own personal inventory (only available to logged-in users)
4. An easy-to-navigate GUI - simple layout and styling in a mobile-first design (but responsive for PCs), using React Styled Components.

## Extensions

1. Local suppliers - basic list, or developed into a search functionality displaying results by distance
2. Model selector - brings up all paints required and cross-references against user inventory
3. Shopping list - which could be ‘transferred’ to linked local supplier website/shopping basket
Administrator accounts - for amending database, and basic GUI

## Advanced Extensions
1. Barcode scanner - scan model barcodes to then bring up required paints (when using on mobile)
2. API endpoints to connect to local supplier websites



