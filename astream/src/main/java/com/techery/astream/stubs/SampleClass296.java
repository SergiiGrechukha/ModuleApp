package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass296 {

    @Ignore    private SampleClass297 sampleClass;

    public SampleClass296(){
        sampleClass = new SampleClass297();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}