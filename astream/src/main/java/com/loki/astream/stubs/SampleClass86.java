package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass86 {

    @Ignore    private SampleClass87 sampleClass;

    public SampleClass86(){
        sampleClass = new SampleClass87();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}