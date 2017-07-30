package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass423 {

    @Ignore    private SampleClass424 sampleClass;

    public SampleClass423(){
        sampleClass = new SampleClass424();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}