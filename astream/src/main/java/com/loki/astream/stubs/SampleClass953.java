package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass953 {

    @Ignore    private SampleClass954 sampleClass;

    public SampleClass953(){
        sampleClass = new SampleClass954();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}