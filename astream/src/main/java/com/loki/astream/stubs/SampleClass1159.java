package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1159 {

    @Ignore    private SampleClass1160 sampleClass;

    public SampleClass1159(){
        sampleClass = new SampleClass1160();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}