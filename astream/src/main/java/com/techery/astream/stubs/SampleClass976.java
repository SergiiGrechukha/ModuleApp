package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass976 {

    @Ignore    private SampleClass977 sampleClass;

    public SampleClass976(){
        sampleClass = new SampleClass977();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}