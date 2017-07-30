package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass541 {

    @Ignore    private SampleClass542 sampleClass;

    public SampleClass541(){
        sampleClass = new SampleClass542();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}