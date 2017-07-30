package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1177 {

    @Ignore    private SampleClass1178 sampleClass;

    public SampleClass1177(){
        sampleClass = new SampleClass1178();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}