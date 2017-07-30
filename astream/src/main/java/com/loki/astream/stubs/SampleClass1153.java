package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1153 {

    @Ignore    private SampleClass1154 sampleClass;

    public SampleClass1153(){
        sampleClass = new SampleClass1154();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}