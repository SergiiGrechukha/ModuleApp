package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1540 {

    @Ignore    private SampleClass1541 sampleClass;

    public SampleClass1540(){
        sampleClass = new SampleClass1541();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}