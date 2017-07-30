package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1186 {

    @Ignore    private SampleClass1187 sampleClass;

    public SampleClass1186(){
        sampleClass = new SampleClass1187();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}