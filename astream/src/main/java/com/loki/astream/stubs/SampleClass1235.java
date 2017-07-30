package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1235 {

    @Ignore    private SampleClass1236 sampleClass;

    public SampleClass1235(){
        sampleClass = new SampleClass1236();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}