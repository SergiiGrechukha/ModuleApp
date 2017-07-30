package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass633 {

    @Ignore    private SampleClass634 sampleClass;

    public SampleClass633(){
        sampleClass = new SampleClass634();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}