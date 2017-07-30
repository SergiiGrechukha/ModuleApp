package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass526 {

    @Ignore    private SampleClass527 sampleClass;

    public SampleClass526(){
        sampleClass = new SampleClass527();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}