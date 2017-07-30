package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass397 {

    @Ignore    private SampleClass398 sampleClass;

    public SampleClass397(){
        sampleClass = new SampleClass398();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}