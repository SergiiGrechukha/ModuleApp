package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass867 {

    @Ignore    private SampleClass868 sampleClass;

    public SampleClass867(){
        sampleClass = new SampleClass868();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}