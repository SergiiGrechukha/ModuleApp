package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass950 {

    @Ignore    private SampleClass951 sampleClass;

    public SampleClass950(){
        sampleClass = new SampleClass951();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}