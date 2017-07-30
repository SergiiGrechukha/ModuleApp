package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass949 {

    @Ignore    private SampleClass950 sampleClass;

    public SampleClass949(){
        sampleClass = new SampleClass950();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}