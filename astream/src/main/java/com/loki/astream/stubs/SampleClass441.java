package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass441 {

    @Ignore    private SampleClass442 sampleClass;

    public SampleClass441(){
        sampleClass = new SampleClass442();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}