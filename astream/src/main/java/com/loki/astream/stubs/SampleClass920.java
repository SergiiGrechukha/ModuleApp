package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass920 {

    @Ignore    private SampleClass921 sampleClass;

    public SampleClass920(){
        sampleClass = new SampleClass921();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}