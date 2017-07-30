package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1214 {

    @Ignore    private SampleClass1215 sampleClass;

    public SampleClass1214(){
        sampleClass = new SampleClass1215();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}