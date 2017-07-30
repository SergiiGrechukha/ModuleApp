package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass856 {

    @Ignore    private SampleClass857 sampleClass;

    public SampleClass856(){
        sampleClass = new SampleClass857();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}