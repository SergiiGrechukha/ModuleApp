package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass209 {

    @Ignore    private SampleClass210 sampleClass;

    public SampleClass209(){
        sampleClass = new SampleClass210();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}