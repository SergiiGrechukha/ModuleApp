package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass755 {

    @Ignore    private SampleClass756 sampleClass;

    public SampleClass755(){
        sampleClass = new SampleClass756();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}