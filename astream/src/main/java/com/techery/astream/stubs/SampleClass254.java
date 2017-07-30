package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass254 {

    @Ignore    private SampleClass255 sampleClass;

    public SampleClass254(){
        sampleClass = new SampleClass255();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}