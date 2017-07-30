package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1059 {

    @Ignore    private SampleClass1060 sampleClass;

    public SampleClass1059(){
        sampleClass = new SampleClass1060();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}