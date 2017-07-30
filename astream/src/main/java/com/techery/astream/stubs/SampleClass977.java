package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass977 {

    @Ignore    private SampleClass978 sampleClass;

    public SampleClass977(){
        sampleClass = new SampleClass978();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}