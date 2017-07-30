package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass42 {

    @Ignore    private SampleClass43 sampleClass;

    public SampleClass42(){
        sampleClass = new SampleClass43();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}