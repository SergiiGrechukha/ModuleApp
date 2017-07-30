package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass595 {

    @Ignore    private SampleClass596 sampleClass;

    public SampleClass595(){
        sampleClass = new SampleClass596();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}