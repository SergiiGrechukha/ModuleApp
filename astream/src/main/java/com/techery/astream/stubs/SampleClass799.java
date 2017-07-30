package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass799 {

    @Ignore    private SampleClass800 sampleClass;

    public SampleClass799(){
        sampleClass = new SampleClass800();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}