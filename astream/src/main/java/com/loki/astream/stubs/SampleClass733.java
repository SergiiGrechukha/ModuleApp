package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass733 {

    @Ignore    private SampleClass734 sampleClass;

    public SampleClass733(){
        sampleClass = new SampleClass734();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}