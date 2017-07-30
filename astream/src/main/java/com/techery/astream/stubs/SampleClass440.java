package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass440 {

    @Ignore    private SampleClass441 sampleClass;

    public SampleClass440(){
        sampleClass = new SampleClass441();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}