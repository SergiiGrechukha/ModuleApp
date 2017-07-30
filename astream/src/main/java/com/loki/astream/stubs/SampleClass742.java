package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass742 {

    @Ignore    private SampleClass743 sampleClass;

    public SampleClass742(){
        sampleClass = new SampleClass743();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}