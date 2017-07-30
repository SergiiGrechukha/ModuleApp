package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1049 {

    @Ignore    private SampleClass1050 sampleClass;

    public SampleClass1049(){
        sampleClass = new SampleClass1050();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}