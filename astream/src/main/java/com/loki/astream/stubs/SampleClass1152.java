package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1152 {

    @Ignore    private SampleClass1153 sampleClass;

    public SampleClass1152(){
        sampleClass = new SampleClass1153();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}