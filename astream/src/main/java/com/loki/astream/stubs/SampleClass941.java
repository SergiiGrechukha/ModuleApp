package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass941 {

    @Ignore    private SampleClass942 sampleClass;

    public SampleClass941(){
        sampleClass = new SampleClass942();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}