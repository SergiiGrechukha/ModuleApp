package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1085 {

    @Ignore    private SampleClass1086 sampleClass;

    public SampleClass1085(){
        sampleClass = new SampleClass1086();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}