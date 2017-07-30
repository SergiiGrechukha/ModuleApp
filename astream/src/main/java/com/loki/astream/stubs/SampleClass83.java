package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass83 {

    @Ignore    private SampleClass84 sampleClass;

    public SampleClass83(){
        sampleClass = new SampleClass84();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}