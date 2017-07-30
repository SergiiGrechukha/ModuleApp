package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass592 {

    @Ignore    private SampleClass593 sampleClass;

    public SampleClass592(){
        sampleClass = new SampleClass593();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}