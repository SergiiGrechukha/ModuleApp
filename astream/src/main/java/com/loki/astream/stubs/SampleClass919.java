package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass919 {

    @Ignore    private SampleClass920 sampleClass;

    public SampleClass919(){
        sampleClass = new SampleClass920();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}