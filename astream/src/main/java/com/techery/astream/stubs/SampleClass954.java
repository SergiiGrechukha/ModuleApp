package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass954 {

    @Ignore    private SampleClass955 sampleClass;

    public SampleClass954(){
        sampleClass = new SampleClass955();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}