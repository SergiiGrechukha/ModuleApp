package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass261 {

    @Ignore    private SampleClass262 sampleClass;

    public SampleClass261(){
        sampleClass = new SampleClass262();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}