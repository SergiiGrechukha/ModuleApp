package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass901 {

    @Ignore    private SampleClass902 sampleClass;

    public SampleClass901(){
        sampleClass = new SampleClass902();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}